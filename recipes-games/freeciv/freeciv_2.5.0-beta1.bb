FREECIV_GUI = "gtk2,gtk3"

require freeciv.inc

DEFAULT_PREFERENCE = "-2"

DEPENDS += "curl gtk+3 xz"

EXTRA_OECONF += "--disable-mapimg"

SRC_URI[md5sum] = "570e5407ea176767da15c4a616687f86"
SRC_URI[sha256sum] = "2152736197d8a6aec6437885f3c476c4238ff64a9756727f0e5ee12b81f36654"

PACKAGES += "${PN}-gtk3"

RDEPENDS_${PN}-gtk3 = "freeciv-common freeciv-client-common"
RPROVIDES_${PN}-gtk3 = "freeciv-client"
FILES_${PN}-gtk3 = "\
${bindir}/freeciv-gtk3 \
${datadir}/freeciv/themes/gui-gtk-3.0 \
${datadir}/freeciv/gtk_menus.xml \
"
