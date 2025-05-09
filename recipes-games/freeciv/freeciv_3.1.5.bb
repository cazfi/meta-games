
require freeciv-qt6.inc

DEPENDS += "lua"

SRC_URI += "\
${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.xz \
file://allow-root-S3_1.patch \
"

SRC_URI[sha256sum] = "0d9f687ff950a77a9fa0af66108a7f67da717fd40c3a0ca4c0a4f4a3f0214b33"
