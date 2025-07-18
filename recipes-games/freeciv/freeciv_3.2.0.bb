
require freeciv-qt6.inc

DEFAULT_PREFERENCE = "-1"

DEPENDS += "lua"

SRC_URI += "\
${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.xz \
file://allow-root-S3_2.patch \
"

SRC_URI[sha256sum] = "828e831b672a46b316f6fdb23e670230b2ec9c05b6fe8c66fc9f7e1c0679fcde"
