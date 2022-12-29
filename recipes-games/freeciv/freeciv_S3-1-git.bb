
require freeciv-qt5.inc

DEFAULT_PREFERENCE = "-2"

DEPENDS += "tolua-native lua gtk4"

SRC_URI += "\
git://github.com/freeciv/freeciv.git;protocol=https;branch=S3_1 \
file://allow-root-S3_1.patch \
"

SRCREV="8d7cdf503164f296990c68e27a4fe3e2a87eb909"
PN = "freeciv"
PV = "3.1.0-alpha5"
S = "${WORKDIR}/git"

FREECIV_GUI += "gtk4"

PACKAGES += "${PN}-gtk4"

RDEPENDS:${PN}-gtk4 = "freeciv-common freeciv-client-common"
RPROVIDES:${PN}-gtk4 = "freeciv-client"
FILES:${PN}-gtk4 = "\
${bindir}/freeciv-gtk4 \
${datadir}/freeciv/themes/gtk4 \
"
