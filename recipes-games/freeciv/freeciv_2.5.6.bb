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

SRC_URI[md5sum] = "ef89d67af05787a262e1fc1666c56a5a"
SRC_URI[sha256sum] = "cfadc23eec11a5a8ae74a7d3719eb126026137f0700da065367fd55cbab6999b"

PACKAGES =+ "${PN}-gtk2"

RDEPENDS_${PN}-gtk2 = "freeciv-common freeciv-client-common"
RPROVIDES_${PN}-gtk2 = "freeciv-client"
FILES_${PN}-gtk2 = "\
${bindir}/freeciv-gtk2 \
${datadir}/freeciv/themes/gui-gtk-2.0 \
${datadir}/freeciv/gtk_menus.xml \
"
