SUMMARY = "Maelstrom is a GPL'd port of the shareware game for the Macintosh"
LICENSE = "GPLv2 & CC-BY-3.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=0642955deaee2fa53c36bc592dc1ef25"
HOMEPAGE = "https://www.libsdl.org/projects/Maelstrom/"

inherit autotools-brokensep pkgconfig gettext gtk-icon-cache

DEPENDS += " \
    libsdl-net \
"

SRC_URI = " \
    https://www.libsdl.org/projects/Maelstrom/src/Maelstrom-${PV}.tar.gz \
    file://0001-Use-pkg-config-to-find-sdl.patch \
    file://0002-buttonlist.h-Fix-build-with-recent-gcc-s.patch \
    file://0003-Fix-install-dir.patch \
    file://0004-Maelstrom-3.0.6-setgid.patch \
    file://0005-SDL_FrameBuf.cpp-Fix-build-for-64Bit-targets.patch \
    file://maelstrom.png \
    file://Maelstrom.desktop \
"
SRC_URI[md5sum] = "96aa6359538a6bd60b4198a792de578b"
SRC_URI[sha256sum] = "e7983c2c7376cdcca1944db1706d92aedd529638cf13358c88a60df982ba7b46"

S = "${WORKDIR}/Maelstrom-${PV}"

do_configure_prepend() {
    touch ${S}/NEWS ${S}/AUTHORS ${S}/ChangeLog
}

do_install() {
    oe_runmake DESTDIR=${D} install install-am

    install -d ${D}/${datadir}/applications
    install -m 644 ${WORKDIR}/Maelstrom.desktop ${D}/${datadir}/applications

    install -d ${D}/${datadir}/icons/hicolor/48x48/apps
    install -m 644 ${WORKDIR}/maelstrom.png ${D}/${datadir}/icons/hicolor/48x48/apps

    install -d ${D}/${localstatedir}/lib/games
    mv ${D}${datadir}/Maelstrom/*Scores ${D}/${localstatedir}/lib/games
}

FILES_${PN} += "${datadir}/Maelstrom"
