
require freeciv-qt5.inc

DEFAULT_PREFERENCE = "-1"

DEPENDS += "lua gtk4 zstd"

SRC_URI += "\
${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.xz \
file://allow-root-S3_1.patch \
"

SRC_URI[sha256sum] = "2fc4ad1f5833b60e18286e6dc5107ef9104d6d81a0e634b5448abdb73636d54e"

FREECIV_GUI += "gtk4"

PACKAGES += "${PN}-gtk4"

RDEPENDS:${PN}-gtk4 = "freeciv-common freeciv-client-common"
RPROVIDES:${PN}-gtk4 = "freeciv-client"
FILES:${PN}-gtk4 = "\
${bindir}/freeciv-gtk4 \
${datadir}/freeciv/themes/gtk4 \
"
