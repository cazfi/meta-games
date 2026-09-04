
require freeciv-qt6.inc

DEPENDS += "lua"

SRC_URI += "\
${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.xz \
file://allow-root-S3_2.patch \
"

OEQA_BUILDPATHS_SKIP = "/home/cazfi"

SRC_URI[sha256sum] = "b3ce15f54083b1fca146f62837a5f7d41d298537fa34940cca70eeb09c7a9c6e"
