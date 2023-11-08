DESCRIPTION = "Simple and Fast Multimedia Library"
HOMEPAGE = "https://www.sfml-dev.org/"
SECTION = "libs"

LICENSE = "Zlib"
LIC_FILES_CHKSUM = "file://license.md;md5=3ddaca891aa952cf42b3ba95d3b853e7"

DEPENDS = "openal-soft glibc gcc-runtime freetype mesa xcb-util-image libjpeg-turbo libxrandr libxcursor"

SRC_URI = "\
https://www.sfml-dev.org/files/SFML-${PV}-sources.zip \
file://Remove-Libs.private-from-pc.patch \
"

SRC_URI[sha256sum] = "5bf19e5c303516987f7f54d4ff1b208a0f9352ffa1cd55f992527016de0e8cb7"

S = "${WORKDIR}/SFML-${PV}"

inherit cmake

FILES:${PN} =+ "${datadir}/SFML"
