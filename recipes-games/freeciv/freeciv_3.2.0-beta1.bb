
require freeciv-qt6.inc

DEFAULT_PREFERENCE = "-1"

DEPENDS += "lua"

SRC_URI += "\
${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.xz \
file://allow-root-S3_2.patch \
"

SRC_URI[sha256sum] = "2800c27096e69c3cbcd30ecda5a1c826cfd85db6db759e7f3bf327d2c9812eb8"
