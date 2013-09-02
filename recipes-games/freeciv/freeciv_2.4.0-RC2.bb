FREECIV_GUI = "gtk2"

require freeciv.inc

DEFAULT_PREFERENCE = "-1"

DEPENDS += "curl"

SRC_URI += "${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.bz2"

EXTRA_OECONF += "--without-magickwand"

SRC_URI[md5sum] = "4268022ba6e273ae7db96a4d1f8c3705"
SRC_URI[sha256sum] = "c75b2cb5631cf8db1fa7834d9387a641a25034aa7c7584e85b82660b3a21f70d"
