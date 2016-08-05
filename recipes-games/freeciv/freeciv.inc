SUMMARY = "Turn-based strategy game inspired by the history of human civilization."
DESCRIPTION = "Freeciv is distributed under the GPL and implemented for X. \
 Freeciv is a turn-based strategy game, in which \
 each player becomes leader of a civilization, fighting to obtain \
 the ultimate goal: The extinction of all other civilizations. \
 "

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SECTION = "games"

DEPENDS = "readline bzip2 curl xz libsdl2-mixer gtk+3 qtbase virtual/gettext"

SRC_URI = "\
file://allow-root.patch \
file://wait-server-start.patch \
"

S = "${WORKDIR}/freeciv-${PV}"
B = "${WORKDIR}/build-${PV}"

inherit autotools pkgconfig

EXTRA_OECONF = "\
--enable-shared --without-ggz-dir --enable-client=${FREECIV_GUI} \
--disable-mapimg \
--disable-sdl2test \
--with-qt5-includes=${STAGING_INCDIR}/qt5 \
--with-qt5-libs=${STAGING_LIBDIR}/qt5 \
MOCCMD=${STAGING_BINDIR_NATIVE}/qt5/moc \
SDL2_CONFIG='${STAGING_BINDIR_NATIVE}/pkg-config sdl2' \
"

acpaths = "-I ${S}/m4 -I ${S}/dependencies/m4"

PACKAGES =+ "${PN}-common ${PN}-server ${PN}-client-common ${PN}-gtk3 ${PN}-qt"

do_install_append() {
        rm -Rf ${D}/${datadir}/appdata
}

RDEPENDS_${PN} = "freeciv-server freeciv-client"

FILES_${PN}-common = "\
${libdir}/libfreeciv.so.0.0.0 \
${libdir}/libfreeciv.so.0 \
${datadir}/po \
${datadir}/icons/hicolor/*/*/freeciv-client.png \
"

RDEPENDS_${PN}-server = "freeciv-common"
FILES_${PN}-server = "\
${bindir}/freeciv-server \
${datadir}/freeciv/default \
${datadir}/freeciv/default.serv \
${datadir}/freeciv/nation \
${datadir}/icons/hicolor/*/*/freeciv-server.png \
"

FILES_${PN}-client-common = "\
${datadir}/freeciv/helpdata.txt \
${datadir}/freeciv/flags \
${datadir}/freeciv/misc \
${datadir}/freeciv/amplio2.tilespec \
${datadir}/freeciv/amplio2 \
${datadir}/freeciv/stdsounds.soundspec \
${datadir}/freeciv/stdsounds \
${datadir}/icons/hicolor/*/*/freeciv-modpack.png \
"

RDEPENDS_${PN}-gtk3 = "freeciv-common freeciv-client-common"
RPROVIDES_${PN}-gtk3 = "freeciv-client"
FILES_${PN}-gtk3 = "\
${bindir}/freeciv-gtk3 \
${datadir}/freeciv/themes/gui-gtk-3.0 \
${datadir}/freeciv/gtk_menus.xml \
"

RDEPENDS_${PN}-qt = "freeciv-common freeciv-client-common qtbase-plugins"
RPROVIDES_${PN}-qt = "freeciv-client"
FILES_${PN}-qt = "\
${bindir}/freeciv-qt \
${datadir}/freeciv/themes/gui-qt \
"
