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

SRC_URI[md5sum] = "9ac12a65166a2ae837975b35ae8a0618"
SRC_URI[sha256sum] = "ffe36736db6a64893681e9eea8b90f7abe05eaebe6b777e82149a98cad6dbed2"

PACKAGES =+ "${PN}-gtk2"

RDEPENDS_${PN}-gtk2 = "freeciv-common freeciv-client-common"
RPROVIDES_${PN}-gtk2 = "freeciv-client"
FILES_${PN}-gtk2 = "\
${bindir}/freeciv-gtk2 \
${datadir}/freeciv/themes/gui-gtk-2.0 \
${datadir}/freeciv/gtk_menus.xml \
"
