FREECIV_GUI = "gtk2,gtk3"

require freeciv.inc

DEFAULT_PREFERENCE = "-1"

DEPENDS += "curl gtk+3 xz"

EXTRA_OECONF += "--disable-mapimg"

SRC_URI[md5sum] = "18679f3600b438480ac53c86bcf3ea39"
SRC_URI[sha256sum] = "11c9c63b746ff83067e0194be49f4075eef0fe099ea9b53053ebe8a96e6d8616"

PACKAGES += "${PN}-gtk3"

RDEPENDS_${PN}-gtk3 = "freeciv-common freeciv-client-common"
RPROVIDES_${PN}-gtk3 = "freeciv-client"
FILES_${PN}-gtk3 = "\
${bindir}/freeciv-gtk3 \
${datadir}/freeciv/themes/gui-gtk-3.0 \
${datadir}/freeciv/gtk_menus.xml \
"
