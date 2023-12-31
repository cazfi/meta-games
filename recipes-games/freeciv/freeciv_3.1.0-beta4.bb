
require freeciv-qt5.inc

DEFAULT_PREFERENCE = "-1"

DEPENDS += "lua gtk4 zstd"

SRC_URI += "\
${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.xz \
file://allow-root-S3_1.patch \
"

SRC_URI[sha256sum] = "2876e169cd20ba38b4ea96406e29a5268654f5042e5d93d26c87cdc199963db9"

FREECIV_GUI += "gtk4"

PACKAGES += "${PN}-gtk4"

RDEPENDS:${PN}-gtk4 = "freeciv-common freeciv-client-common"
RPROVIDES:${PN}-gtk4 = "freeciv-client"
FILES:${PN}-gtk4 = "\
${bindir}/freeciv-gtk4 \
${datadir}/freeciv/themes/gtk4 \
"
