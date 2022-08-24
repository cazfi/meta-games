SUMMARY = "Maelstrom is a GPL'd port of the shareware game for the Macintosh"
LICENSE = "GPL-2.0-only & CC-BY-3.0"
LIC_FILES_CHKSUM = "\
 file://COPYING.GPL;md5=d368405f1c604912f51ba286eed9944a \
 file://COPYING.txt;md5=1ade764d012d246f775dc01dc4f7c1af \
"

HOMEPAGE = "https://www.libsdl.org/projects/Maelstrom/"

inherit autotools-brokensep pkgconfig gettext gtk-icon-cache

DEPENDS += " \
    libsdl2-net \
"

SRC_URI = " \
    https://www.libsdl.org/projects/Maelstrom/src/Maelstrom-${PV}.tar.gz \
    file://0001-Use-pkg-config-to-find-sdl.patch \
    file://0002-buttonlist.h-Fix-build-with-recent-gcc-s.patch \
    file://0004-Maelstrom-3.0.6-setgid.patch \
    file://0006-scores.cpp-Fix-build-with-hardened-security-flags.patch \
    file://maelstrom.png \
    file://Maelstrom.desktop \
"

SRC_URI[sha256sum] = "93680322f4b04d4727ea8e0b461f259b604dc69e7465cb91d2b9aad378a9a036"

S = "${WORKDIR}/Maelstrom-${PV}"

do_configure:prepend() {
    touch ${S}/NEWS ${S}/AUTHORS ${S}/ChangeLog ${S}/COPYING ${S}/README
}

do_install() {
    oe_runmake DESTDIR=${D} install install-am

    install -d ${D}/${datadir}/applications
    install -m 644 ${WORKDIR}/Maelstrom.desktop ${D}/${datadir}/applications

    install -d ${D}/${datadir}/icons/hicolor/48x48/apps
    install -m 644 ${WORKDIR}/maelstrom.png ${D}/${datadir}/icons/hicolor/48x48/apps

    install -d ${D}/${localstatedir}/lib/games
}

FILES:${PN} += "/usr/games/Maelstrom"
