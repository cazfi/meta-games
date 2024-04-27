
require freeciv-qt6.inc

DEPENDS += "lua gtk4 zstd"

SRC_URI += "\
${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.xz \
file://allow-root-S3_1.patch \
"

SRC_URI[sha256sum] = "b2bd00c0e2a6c81bcb52aa0dddf81f2f4543705bf7a9fcd5afac3f7b3fff5ef6"
