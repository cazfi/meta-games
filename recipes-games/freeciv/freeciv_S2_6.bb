FREECIV_GUI = "gtk3.22,qt,sdl2"

require freeciv.inc

DEFAULT_PREFERENCE = "-1"

DEPENDS += "libsdl2-image libsdl2-ttf libsdl2-gfx freetype"

BRANCH = "S2_6"
SRCREV="34736"
SRC_URI += "svn://svn.gna.org/svn/freeciv;module=branches/${BRANCH} \
"
PV = "2.6.0-beta0+r${SRCREV}"

EXTRA_OECONF += "\
"

S = "${WORKDIR}/branches/${BRANCH}"

PACKAGES =+ "${PN}-sdl2 ${PN}-gtk3.22"

RDEPENDS_${PN}-gtk3.22 = "freeciv-common freeciv-client-common"
RPROVIDES_${PN}-gtk3.22 = "freeciv-client"
FILES_${PN}-gtk3.22 = "\
${bindir}/freeciv-gtk3.22 \
${datadir}/freeciv/themes/gui-gtk-3.22 \
${datadir}/freeciv/gtk3_menus.xml \
"

RDEPENDS_${PN}-sdl2 = "freeciv-common freeciv-client-common"
RPROVIDES_${PN}-sdl2 = "freeciv-client"
FILES_${PN}-sdl2 = "\
${bindir}/freeciv-sdl2 \
${datadir}/freeciv/themes/gui-sdl2 \
"
