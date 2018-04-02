DESCRIPTION = "Simple and Fast Multimedia Library"
HOMEPAGE = "http://www.sfml-dev.org/index.php"
SECTION = "libs"

LICENSE = "Zlib"
LIC_FILES_CHKSUM = "file://license.txt;md5=718d3cda2de6e8be3c98a12c104820d2"

DEPENDS = "openal-soft glibc gcc-runtime freetype mesa xcb-util-image libjpeg-turbo libxrandr"

SRC_URI = "http://www.sfml-dev.org/files/SFML-${PV}-sources.zip"

SRC_URI[md5sum] = "0c04d339aee57c08097ba45a66b870ed"
SRC_URI[sha256sum] = "8ba04f6fde6a7b42527d69742c49da2ac529354f71f553409f9f821d618de4b6"

S = "${WORKDIR}/SFML-${PV}"

inherit cmake

FILES_${PN} =+ "${datadir}/SFML"
