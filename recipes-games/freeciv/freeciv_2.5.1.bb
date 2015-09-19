FREECIV_GUI = "gtk2,gtk3,qt"

require freeciv.inc

DEPENDS += "gtk+3 qtbase"

EXTRA_OECONF += "\
--with-qt5-includes=${STAGING_INCDIR}/qt5 \
--with-qt5-libs=${STAGING_LIBDIR}/qt5 \
MOCCMD=${STAGING_BINDIR_NATIVE}/qt5/moc \
"

SRC_URI[md5sum] = "b94bf68ce5f3611c71fac9753598b046"
SRC_URI[sha256sum] = "4e420a9ad91aa7966039ec3b63501725c8261a4ff734d56fe801414fae772696"

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
