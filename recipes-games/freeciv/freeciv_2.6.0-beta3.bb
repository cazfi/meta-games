FREECIV_GUI = "gtk3.22,qt,sdl2"

require freeciv.inc

DEFAULT_PREFERENCE = "-1"

DEPENDS += "libsdl2-image libsdl2-ttf libsdl2-gfx freetype"

SRC_URI += "\
${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.bz2 \
"

SRC_URI[md5sum] = "adc715f83876d7e32c5462b2150f2639"
SRC_URI[sha256sum] = "7f259aecee88b631b4d64b5c5f6b864969deac5c0dc8e8b662e76cb7a4073b09"

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
