FREECIV_GUI = "gtk2,gtk3,qt"

require freeciv.inc

DEPENDS += "gtk+3 qtbase"

EXTRA_OECONF += "\
--with-qt5-includes=${STAGING_INCDIR}/qt5 \
--with-qt5-libs=${STAGING_LIBDIR}/qt5 \
MOCCMD=${STAGING_BINDIR_NATIVE}/qt5/moc \
"

SRC_URI[md5sum] = "cf71d2fbfdb7238e14ead864e06507d9"
SRC_URI[sha256sum] = "2b5665da849c8f95b9225857fc02935140de2d44cd1a112f9cf3086a84d0b5be"

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
