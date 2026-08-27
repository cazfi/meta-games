
require freeciv-qt6.inc

DEPENDS += "lua"

SRC_URI += "\
${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.xz \
file://allow-root-S3_2.patch \
file://0036-INSTALL.meson-Replace-home-cazfi-with-home-user-in-e.patch \
"

SRC_URI[sha256sum] = "d32808f02a9b9f49ef159bcbf266b16ce2a3ce6ea8f71115d80f952c3cc609e8"
