FREECIV_GUI = "gtk2"

require freeciv.inc

DEPENDS += "curl xz"

EXTRA_OECONF += "--disable-mapimg"

SRC_URI[md5sum] = "038c53184497fcf31bcd268418dbe4f6"
SRC_URI[sha256sum] = "8307fc9d69571b031ccc465e8029d8a7ea3dbef4e3651f2de07356aba931e2a3"
