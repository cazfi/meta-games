
require freeciv-qt5.inc

DEPENDS += "lua gtk4 zstd"

SRC_URI += "\
${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.xz \
file://allow-root-S3_1.patch \
"

SRC_URI[sha256sum] = "d746a883937b955b0ee1d1eba8b4e82354f7f72051ac4f514de7ab308334506e"
