SUMMARY = "Turn-based strategy game inspired by the history of human civilization."
DESCRIPTION = "Freeciv is distributed under the GPL and implemented for X. \
 Freeciv is a turn-based strategy game, in which \
 each player becomes leader of a civilization, fighting to obtain \
 the ultimate goal: The extinction of all other civilizations. \
 "
HOMEPAGE = "https://www.freeciv.org/"

LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SECTION = "games"

FREECIV_GUI = "gtk3.22,qt,sdl2"

DEPENDS = "readline bzip2 curl xz libsdl2-mixer gtk+3 qtbase virtual/gettext qttools-native libsdl2-image libsdl2-ttf libsdl2-gfx freetype"

SRC_URI = "\
file://allow-root.patch \
"

S = "${WORKDIR}/freeciv-${PV}"
B = "${WORKDIR}/build-${PV}"

inherit autotools pkgconfig gettext

EXTRA_OECONF = "\
ac_cv_working_gettimeofday=yes \
ac_cv_func_working_vsnprintf=yes \
--enable-patient-connect \
--enable-shared --enable-client=${FREECIV_GUI} \
--disable-mapimg \
--disable-sdl2test \
--with-sqlite3-prefix=${STAGING_DIR} \
SDL2_CONFIG='${STAGING_BINDIR_NATIVE}/pkg-config sdl2' \
"

acpaths = "-I ${S}/m4 -I ${S}/dependencies/m4"

PACKAGES =+ "${PN}-common ${PN}-server ${PN}-client-common \
${PN}-gtk3.22 ${PN}-qt ${PN}-sdl2"

do_install:append() {
        rm -Rf ${D}/${datadir}/appdata
        rm -Rf ${D}/${datadir}/metainfo
        rm -Rf ${D}/${datadir}/icons/hicolor/*/*/freeciv-ruledit.png
}

RDEPENDS:${PN} = "freeciv-server freeciv-client"

FILES:${PN}-common = "\
${libdir}/libfreeciv.so.0.0.0 \
${libdir}/libfreeciv.so.0 \
${datadir}/po \
${datadir}/icons/hicolor/*/*/freeciv-client.png \
"

RDEPENDS:${PN}-server = "freeciv-common"
FILES:${PN}-server = "\
${bindir}/freeciv-server \
${datadir}/freeciv/default \
${datadir}/freeciv/default.serv \
${datadir}/freeciv/classic \
${datadir}/freeciv/classic.serv \
${datadir}/freeciv/civ2civ3 \
${datadir}/freeciv/civ2civ3.serv \
${datadir}/freeciv/nation \
${datadir}/icons/hicolor/*/*/freeciv-server.png \
"

FILES:${PN}-client-common = "\
${datadir}/freeciv/helpdata.txt \
${datadir}/freeciv/flags \
${datadir}/freeciv/misc \
${datadir}/freeciv/amplio2.tilespec \
${datadir}/freeciv/amplio2 \
${datadir}/freeciv/hexemplio.tilespec \
${datadir}/freeciv/hexemplio \
${datadir}/freeciv/stdsounds.soundspec \
${datadir}/freeciv/stdsounds \
${datadir}/freeciv/stdmusic.musicspec \
${datadir}/freeciv/stdmusic \
${datadir}/icons/hicolor/*/*/freeciv-modpack.png \
"

RDEPENDS:${PN}-gtk3.22 = "freeciv-common freeciv-client-common"
RPROVIDES:${PN}-gtk3.22 = "freeciv-client"
FILES:${PN}-gtk3.22 = "\
${bindir}/freeciv-gtk3.22 \
${datadir}/freeciv/themes/gtk3.22 \
${datadir}/freeciv/themes/gui-gtk-3.22 \
${datadir}/freeciv/gtk3.22_menus.xml \
"

RDEPENDS:${PN}-qt = "freeciv-common freeciv-client-common qtbase-plugins"
RPROVIDES:${PN}-qt = "freeciv-client"
FILES:${PN}-qt = "\
${bindir}/freeciv-qt \
${datadir}/freeciv/themes/gui-qt \
"

RDEPENDS:${PN}-sdl2 = "freeciv-common freeciv-client-common"
RPROVIDES:${PN}-sdl2 = "freeciv-client"
FILES:${PN}-sdl2 = "\
${bindir}/freeciv-sdl2 \
${datadir}/freeciv/themes/gui-sdl2 \
"
