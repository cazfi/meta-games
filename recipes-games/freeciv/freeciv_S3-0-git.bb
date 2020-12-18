
require freeciv.inc

DEFAULT_PREFERENCE = "-2"

DEPENDS += "tolua-native"

SRC_URI += "\
git://github.com/freeciv/freeciv.git;branch=S3_0 \
file://0016-Add-enable-patient-connect-configure-option.patch \
"

SRCREV="ade94d1a2619d0e158ef361729c2d8aa7e93467b"
PN = "freeciv"
PV = "3.0.0-alpha5"
S = "${WORKDIR}/git"
