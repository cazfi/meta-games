FREECIV_GUI = "gtk2"

require freeciv.inc

DEFAULT_PREFERENCE = "-1"

DEPENDS += "curl"

SRC_URI += "${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.bz2"

EXTRA_OECONF += "--without-magickwand"

SRC_URI[md5sum] = "10c9cec7a094b991204c82b2dd506298"
SRC_URI[sha256sum] = "7b2a9e6f777d2ac62bad9378dd7d03e4be07527c89d892b8f12b6b18fd0d80ad"
