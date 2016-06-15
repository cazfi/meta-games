FREECIV_GUI = "gtk2,gtk3,qt"

require freeciv.inc

DEPENDS += "libsdl2-mixer gtk+3 qtbase"

EXTRA_OECONF += "\
--with-qt5-includes=${STAGING_INCDIR}/qt5 \
--with-qt5-libs=${STAGING_LIBDIR}/qt5 \
MOCCMD=${STAGING_BINDIR_NATIVE}/qt5/moc \
SDL2_CONFIG='${STAGING_BINDIR_NATIVE}/pkg-config sdl2' \
--enable-sdl-mixer=sdl2 \
"

SRC_URI += "\
${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.bz2 \
"

SRC_URI[md5sum] = "f2b2e1f0afc7daecc9050bf6ceadb1d8"
SRC_URI[sha256sum] = "9e64ef047fd0d2f8e9aa1da01586dea7cfe63a36b15875c168ada555c2e6634b"

PACKAGES =+ "${PN}-gtk3 ${PN}-qt"

RDEPENDS_${PN}-gtk3 = "freeciv-common freeciv-client-common"
RPROVIDES_${PN}-gtk3 = "freeciv-client"
FILES_${PN}-gtk3 = "\
${bindir}/freeciv-gtk3 \
${datadir}/freeciv/themes/gui-gtk-3.0 \
${datadir}/freeciv/gtk_menus.xml \
"

RDEPENDS_${PN}-qt = "freeciv-common freeciv-client-common qtbase-plugins"
RPROVIDES_${PN}-qt = "freeciv-client"
FILES_${PN}-qt = "\
${bindir}/freeciv-qt \
${datadir}/freeciv/themes/gui-qt \
"
