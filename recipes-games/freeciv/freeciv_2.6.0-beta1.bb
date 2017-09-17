FREECIV_GUI = "gtk3.22,qt,sdl2"

require freeciv.inc

DEFAULT_PREFERENCE = "-1"

DEPENDS += "libsdl2-image libsdl2-ttf libsdl2-gfx freetype"

SRC_URI += "\
${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.bz2 \
file://0002-Allow-building-without-tolua.patch \
"

SRC_URI[md5sum] = "74dc470ba062eda0c9b0ffbc77582f72"
SRC_URI[sha256sum] = "2738dc98073eb97c35f47d9b0d3b34decf783766ff7afbe08bded9092730b759"

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
