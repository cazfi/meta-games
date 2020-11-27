
require freeciv.inc

SRC_URI += "\
${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.bz2 \
file://0013-Add-enable-patient-connect-configure-option.patch \
"

SRC_URI[sha256sum] = "bd04ac03c1505582309dd62bcc4710002a3cfb4b2b38c28af33047dd2fb7585e"
