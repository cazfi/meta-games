FREECIV_GUI = "gtk2,gtk3,qt"

require freeciv.inc

DEPENDS =+ "gtk+"

EXTRA_OECONF += "\
--without-ggz-dir \
--enable-sdl-mixer=sdl2 \
"

SRC_URI += "\
${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.bz2 \
"

SRC_URI[md5sum] = "451a6d0447c4e3ddb51286dda110b5f1"
SRC_URI[sha256sum] = "6781e655c514d0a86975c87235de24f740cbdf81f33711d68a910b360963bd30"

PACKAGES =+ "${PN}-gtk2"

RDEPENDS_${PN}-gtk2 = "freeciv-common freeciv-client-common"
RPROVIDES_${PN}-gtk2 = "freeciv-client"
FILES_${PN}-gtk2 = "\
${bindir}/freeciv-gtk2 \
${datadir}/freeciv/themes/gui-gtk-2.0 \
${datadir}/freeciv/gtk_menus.xml \
"
