
require freeciv-qt6.inc

DEFAULT_PREFERENCE = "-2"

DEPENDS += "tolua-native lua"

SRC_URI += "\
git://github.com/freeciv/freeciv.git;protocol=https;branch=S3_2 \
file://allow-root-S3_2.patch \
"

SRCREV="cf06c4b0eea932e6ee9919f13b84b6bea8713aa7"
PN = "freeciv"
PV = "3.2.0-alpha4"
S = "${WORKDIR}/git"
