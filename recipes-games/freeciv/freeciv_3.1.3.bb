
require freeciv-qt6.inc

DEPENDS += "lua"

SRC_URI += "\
${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.xz \
file://allow-root-S3_1.patch \
"

SRC_URI[sha256sum] = "741086fa94574374c7c27480f77ee68e5b538bfb2eff85004fa8c87b312c7f2f"
