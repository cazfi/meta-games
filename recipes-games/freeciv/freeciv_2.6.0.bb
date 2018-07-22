FREECIV_GUI = "gtk3.22,qt,sdl2"

require freeciv.inc

DEFAULT_PREFERENCE = "-1"

DEPENDS += "libsdl2-image libsdl2-ttf libsdl2-gfx freetype"

SRC_URI += "\
${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.bz2 \
"

SRC_URI[md5sum] = "403941dc4eca22b5b76bc9e7587a1134"
SRC_URI[sha256sum] = "7c20399198d6c7d846fed9a69b02e01134ae5340a3ae0f99d1e38063ade6c999"

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
