
require freeciv-qt6.inc

DEFAULT_PREFERENCE = "-1"

DEPENDS += "lua"

SRC_URI += "\
${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.xz \
file://allow-root-S3_2.patch \
"

SRC_URI[sha256sum] = "425cce907e985cfe1b5a1815043bfc2b57c2e089d23f24be510921bd0d1ae7c3"
