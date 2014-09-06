DESCRIPTION = "Pingus is a free Lemmings clone."
DEPENDS = "virtual/libiconv boost libpng libglu libsdl-mixer libsdl-image"
LICENSE = "GPLv3+"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"
HOMEPAGE = "http://pingus.seul.org/"

RDEPENDS_${PN} += "libmikmod"

inherit scons sdl pythonnative

SRC_URI = "\
  http://${PN}.googlecode.com/files/${P}.tar.bz2 \
  file://version.patch \
  file://sdl_pkgconfig.patch \
  file://pingus.desktop \
  file://pingus.png \
"

EXTRA_OESCONS = "CC='${CC}' CXX='${CXX}'"

do_install() {
	install -d ${D}${bindir}
	install -d ${D}${datadir}/pingus
	install -d ${D}${datadir}/pixmaps
	install -d ${D}${datadir}/applications
	install -m 0644 ${WORKDIR}/pingus.png ${D}${datadir}/pixmaps
	cp -a ${S}/data ${D}/${datadir}/pingus
	install -m 0644 ${WORKDIR}/pingus.desktop ${D}${datadir}/applications
	install -m 0755 ${S}/build/pingus ${D}${bindir}/pingus
}

FILES_${PN} += "${datadir}"

SRC_URI[md5sum] = "561798686f34d3fa4e69135d655f47ac"
SRC_URI[sha256sum] = "759c1253075d1e72691bc1e770b24cdd51917041fd1857c1daf85b65a6686460"
