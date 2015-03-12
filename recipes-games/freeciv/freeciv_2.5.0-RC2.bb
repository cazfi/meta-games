FREECIV_GUI = "gtk2,gtk3,qt"

require freeciv.inc

DEFAULT_PREFERENCE = "-1"

DEPENDS += "curl gtk+3 xz qtbase"

EXTRA_OECONF += "\
--with-qt5-includes=${STAGING_INCDIR}/qt5 \
--with-qt5-libs=${STAGING_LIBDIR}/qt5 \
--disable-mapimg"

SRC_URI[md5sum] = "5f3df41bdfe17c64f5813b1afbc720fb"
SRC_URI[sha256sum] = "2308b739d2b9e974c18182f54f8eda2816bb54afcb272fee3efef4d3f725db8c"

PACKAGES =+ "${PN}-gtk3 ${PN}-qt"

RDEPENDS_${PN}-gtk3 = "freeciv-common freeciv-client-common"
RPROVIDES_${PN}-gtk3 = "freeciv-client"
FILES_${PN}-gtk3 = "\
${bindir}/freeciv-gtk3 \
${datadir}/freeciv/themes/gui-gtk-3.0 \
${datadir}/freeciv/gtk_menus.xml \
"

RDEPENDS_${PN}-qt = "freeciv-common freeciv-client-common qtbase-plugins qtbase-fonts"
RPROVIDES_${PN}-qt = "freeciv-client"
FILES_${PN}-qt = "\
${bindir}/freeciv-qt \
${datadir}/freeciv/themes/gui-qt \
"
