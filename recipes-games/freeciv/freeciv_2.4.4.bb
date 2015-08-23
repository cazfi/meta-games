FREECIV_GUI = "gtk2"

require freeciv.inc

DEPENDS += "curl xz"

EXTRA_OECONF += "--disable-mapimg"

LIC_FILES_CHKSUM = "file://COPYING;md5=0636e73ff0215e8d672dc4c32c317bb3"

SRC_URI[md5sum] = "038c53184497fcf31bcd268418dbe4f6"
SRC_URI[sha256sum] = "8307fc9d69571b031ccc465e8029d8a7ea3dbef4e3651f2de07356aba931e2a3"
