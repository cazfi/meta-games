FREECIV_GUI = "gtk2,gtk3,qt"

require freeciv.inc

DEFAULT_PREFERENCE = "-1"

DEPENDS += "curl gtk+3 xz qtbase"

EXTRA_OECONF += "\
--with-qt5-includes=${STAGING_INCDIR}/qt5 \
--with-qt5-libs=${STAGING_LIBDIR}/qt5 \
--disable-mapimg"

SRC_URI[md5sum] = "8a61ecd986853200326711446c573f1b"
SRC_URI[sha256sum] = "bd9f7523ea79b8d2806d0c1844a9f48506ccd18276330580319913c43051210b"

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
