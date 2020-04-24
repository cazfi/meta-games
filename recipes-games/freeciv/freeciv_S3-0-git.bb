
FREECIV_GUI = "gtk3.22,qt,sdl2"

require freeciv.inc

DEFAULT_PREFERENCE = "-2"

DEPENDS += "libsdl2-image libsdl2-ttf libsdl2-gfx freetype tolua-native"

SRC_URI += "\
git://github.com/freeciv/freeciv.git;branch=S3_0\
"
SRCREV="c319fab994f98076d502da78724c129830e5bd13"
PN = "freeciv"
PV = "3.0.0-alpha4"
S = "${WORKDIR}/git"

PACKAGES =+ "${PN}-sdl2 ${PN}-gtk3.22"

RDEPENDS_${PN}-gtk3.22 = "freeciv-common freeciv-client-common"
RPROVIDES_${PN}-gtk3.22 = "freeciv-client"
FILES_${PN}-gtk3.22 = "\
${bindir}/freeciv-gtk3.22 \
${datadir}/freeciv/themes/gui-gtk-3.22 \
${datadir}/freeciv/gtk3.22_menus.xml \
"

RDEPENDS_${PN}-sdl2 = "freeciv-common freeciv-client-common"
RPROVIDES_${PN}-sdl2 = "freeciv-client"
FILES_${PN}-sdl2 = "\
${bindir}/freeciv-sdl2 \
${datadir}/freeciv/themes/gui-sdl2 \
"
