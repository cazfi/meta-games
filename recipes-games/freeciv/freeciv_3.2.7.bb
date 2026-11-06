
require freeciv-qt6.inc

DEPENDS += "lua"

SRC_URI += "\
${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.xz \
file://allow-root-S3_2.patch \
"

OEQA_BUILDPATHS_SKIP = "/home/cazfi"

SRC_URI[sha256sum] = "2720076d50f29db42cdc5e510e7c098f7793f7c0ac410fdf390a52bc57507917"
