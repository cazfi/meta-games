FREECIV_GUI = "gtk2,gtk3,qt"

require freeciv.inc

DEPENDS += "libsdl2-mixer gtk+3 qtbase"

EXTRA_OECONF += "\
--with-qt5-includes=${STAGING_INCDIR}/qt5 \
--with-qt5-libs=${STAGING_LIBDIR}/qt5 \
MOCCMD=${STAGING_BINDIR_NATIVE}/qt5/moc \
SDL2_CONFIG='${STAGING_BINDIR_NATIVE}/pkg-config sdl2' \
-enable-sdl-mixer=sdl2 \
"

SRC_URI += "\
${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.bz2 \
"

SRC_URI[md5sum] = "6bbdfa23392ca88fdb0b8f7caca66ddd"
SRC_URI[sha256sum] = "480b0381c64bf1a9423f2507a75d76bda9bf45c3c3badd30b5bad105e75d805c"

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
