SUMMARY = "Turn-based strategy game inspired by the history of human civilization."
DESCRIPTION = "Freeciv is distributed under the GPL and implemented for X. \
 Freeciv is a turn-based strategy game, in which \
 each player becomes leader of a civilization, fighting to obtain \
 the ultimate goal: The extinction of all other civilizations. \
 "

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SECTION = "games"

FREECIV_GUI = "gtk3.22,qt,sdl2"

DEPENDS = "readline bzip2 curl xz libsdl2-mixer gtk+3 qtbase virtual/gettext qttools-native libsdl2-image libsdl2-ttf libsdl2-gfx freetype"

SRC_URI = "\
file://allow-root.patch \
file://0013-Add-enable-patient-connect-configure-option.patch \
"

S = "${WORKDIR}/freeciv-${PV}"
B = "${WORKDIR}/build-${PV}"

inherit autotools pkgconfig gettext qmake5_paths

EXTRA_OECONF = "\
--enable-patient-connect \
--enable-shared --enable-client=${FREECIV_GUI} \
--disable-mapimg \
--disable-sdl2test \
--with-sqlite3-prefix=${STAGING_DIR} \
--with-qt5-includes=${STAGING_INCDIR}${QT_DIR_NAME} \
--with-qt5-libs=${STAGING_LIBDIR}${QT_DIR_NAME} \
MOCCMD=${STAGING_BINDIR_NATIVE}${QT_DIR_NAME}/moc \
SDL2_CONFIG='${STAGING_BINDIR_NATIVE}/pkg-config sdl2' \
"

acpaths = "-I ${S}/m4 -I ${S}/dependencies/m4"

PACKAGES =+ "${PN}-common ${PN}-server ${PN}-client-common \
${PN}-gtk3.22 ${PN}-qt ${PN}-sdl2"

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

RDEPENDS_${PN}-gtk3.22 = "freeciv-common freeciv-client-common"
RPROVIDES_${PN}-gtk3.22 = "freeciv-client"
FILES_${PN}-gtk3.22 = "\
${bindir}/freeciv-gtk3.22 \
${datadir}/freeciv/themes/gui-gtk-3.22 \
${datadir}/freeciv/gtk3.22_menus.xml \
"

RDEPENDS_${PN}-qt = "freeciv-common freeciv-client-common qtbase-plugins"
RPROVIDES_${PN}-qt = "freeciv-client"
FILES_${PN}-qt = "\
${bindir}/freeciv-qt \
${datadir}/freeciv/themes/gui-qt \
"

RDEPENDS_${PN}-sdl2 = "freeciv-common freeciv-client-common"
RPROVIDES_${PN}-sdl2 = "freeciv-client"
FILES_${PN}-sdl2 = "\
${bindir}/freeciv-sdl2 \
${datadir}/freeciv/themes/gui-sdl2 \
"
