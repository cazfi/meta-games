FREECIV_GUI = "gtk2,gtk3"

require freeciv.inc

DEFAULT_PREFERENCE = "-1"

DEPENDS += "curl gtk+3 xz"

EXTRA_OECONF += "--disable-mapimg"

SRC_URI[md5sum] = "ab652fd019b9ab8081a92016388fe0d0"
SRC_URI[sha256sum] = "9fa7d78ada7ff675ac249ab347a888dad62e49dbe4e2fc02b40c65a5169900e2"

SRC_URI += "\
file://IntroScreenDimensionsGtk3-2.patch \
"

PACKAGES += "${PN}-gtk3"

RDEPENDS_${PN}-gtk3 = "freeciv-common freeciv-client-common"
RPROVIDES_${PN}-gtk3 = "freeciv-client"
FILES_${PN}-gtk3 = "\
${bindir}/freeciv-gtk3 \
${datadir}/freeciv/themes/gui-gtk-3.0 \
${datadir}/freeciv/gtk_menus.xml \
"
