
require freeciv.inc

DEFAULT_PREFERENCE = "-2"

DEPENDS += "tolua-native"

SRC_URI += "\
git://github.com/freeciv/freeciv.git;branch=S3_0\
"
SRCREV="c319fab994f98076d502da78724c129830e5bd13"
PN = "freeciv"
PV = "3.0.0-alpha4"
S = "${WORKDIR}/git"
