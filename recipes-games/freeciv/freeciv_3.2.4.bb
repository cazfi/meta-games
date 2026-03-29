
require freeciv-qt6.inc

DEPENDS += "lua"

SRC_URI += "\
${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.xz \
file://allow-root-S3_2.patch \
"

SRC_URI[sha256sum] = "e0a19508bf69dc4fb7c251d391253794d772bfcce2dbd30fa453521244edd32c"
