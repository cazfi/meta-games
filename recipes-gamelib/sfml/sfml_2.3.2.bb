DESCRIPTION = "Simple and Fast Multimedia Library"
HOMEPAGE = "http://www.sfml-dev.org/index.php"
SECTION = "libs"

LICENSE = "Zlib"
LIC_FILES_CHKSUM = "file://license.txt;md5=00301d7afaf752bdaec51efe06a00c88"

DEPENDS = "openal-soft glibc gcc-runtime freetype mesa xcb-util-image libjpeg-turbo"

SRC_URI = "http://www.sfml-dev.org/files/SFML-${PV}-sources.zip"

SRC_URI[md5sum] = "7f152bab6afc8ccbddaf51d6da318201"
SRC_URI[sha256sum] = "03fe79943c48222037f1126a581b12c95a4dd53168881907964695c5ec3dc395"

S = "${WORKDIR}/SFML-${PV}"

inherit cmake

FILES_${PN} =+ "${datadir}/SFML"
