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

SRC_URI[md5sum] = "dfae0812bb72b19e366f9d5c72e6c3f1"
SRC_URI[sha256sum] = "b83c73585ae80898b27379984f936591b51422c9caccb94880fa16030c975928"

PACKAGES =+ "${PN}-gtk2"

RDEPENDS_${PN}-gtk2 = "freeciv-common freeciv-client-common"
RPROVIDES_${PN}-gtk2 = "freeciv-client"
FILES_${PN}-gtk2 = "\
${bindir}/freeciv-gtk2 \
${datadir}/freeciv/themes/gui-gtk-2.0 \
${datadir}/freeciv/gtk_menus.xml \
"
