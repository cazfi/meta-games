
require freeciv.inc

SRC_URI += "\
${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.bz2 \
file://0013-Add-enable-patient-connect-configure-option.patch \
"

SRC_URI[sha256sum] = "77432e027557a9eb407dac730ae9810ee172abe37111deb017fe72b8183ff8d1"
