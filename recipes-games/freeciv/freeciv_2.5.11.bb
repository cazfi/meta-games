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

SRC_URI[md5sum] = "3998a93932bef893f8c33698bbf7ce98"
SRC_URI[sha256sum] = "4c9c526952fe977cb4b302b8ccf75798fd066c6dde670f72f677fe4964259aad"

PACKAGES =+ "${PN}-gtk2 ${PN}-gtk3"

RDEPENDS_${PN}-gtk2 = "freeciv-common freeciv-client-common"
RPROVIDES_${PN}-gtk2 = "freeciv-client"
FILES_${PN}-gtk2 = "\
${bindir}/freeciv-gtk2 \
${datadir}/freeciv/themes/gui-gtk-2.0 \
${datadir}/freeciv/gtk_menus.xml \
"

RDEPENDS_${PN}-gtk3 = "freeciv-common freeciv-client-common"
RPROVIDES_${PN}-gtk3 = "freeciv-client"
FILES_${PN}-gtk3 = "\
${bindir}/freeciv-gtk3 \
${datadir}/freeciv/themes/gui-gtk-3.0 \
${datadir}/freeciv/gtk_menus.xml \
"
