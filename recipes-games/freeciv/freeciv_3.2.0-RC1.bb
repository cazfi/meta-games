
require freeciv-qt6.inc

DEFAULT_PREFERENCE = "-1"

DEPENDS += "lua"

SRC_URI += "\
${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.xz \
file://allow-root-S3_2.patch \
"

SRC_URI[sha256sum] = "f6b7310f7838c58efe118029b606906cd83b35700c5ff25d95b7568df80a5d60"
