DESCRIPTION = "Pingus is a free Lemmings clone."
DEPENDS = "virtual/libiconv boost libpng libglu libsdl-mixer libsdl-image"
LICENSE = "GPLv3+"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"
HOMEPAGE = "http://pingus.seul.org/"

RDEPENDS:${PN} += "libmikmod bash"

inherit scons pkgconfig python3native

SRC_URI = "\
    git://github.com/Pingus/pingus.git \
    file://0001-Add-missing-header-for-std-function-and-std-bind.patch \
    file://0002-Fix-build-with-boost-1.69.0.patch \
    file://0003-SConscript-Fix-for-python3.patch \
    file://version.patch \
    file://sdl_pkgconfig.patch \
    file://pingus.desktop \
    file://pingus.png \
"
SRCREV = "a147274b76509ae543db2286a8710afe2d426666"
S = "${WORKDIR}/git"

EXTRA_OESCONS = "CC='${CC} -fPIC' CXX='${CXX} -fPIC' LINKFLAGS='${LDFLAGS}'"
CLEANBROKEN = "1"

do_install() {
	install -d ${D}${bindir}
	install -d ${D}${datadir}/pingus
	install -d ${D}${datadir}/pixmaps
	install -d ${D}${datadir}/applications
	install -m 0644 ${WORKDIR}/pingus.png ${D}${datadir}/pixmaps
	cp -dR ${S}/data ${D}/${datadir}/pingus
	rm ${D}/${datadir}/pingus/data/po/*.sh
	rm ${D}/${datadir}/pingus/data/po/*.guile
	rm ${D}/${datadir}/pingus/data/po/*.pot
	install -m 0644 ${WORKDIR}/pingus.desktop ${D}${datadir}/applications
	install -m 0755 ${S}/build/pingus ${D}${bindir}/pingus
}

FILES:${PN} += "${datadir}"

SRC_URI[md5sum] = "8f366e7ba76c9f3525888efe8b04b1ad"
SRC_URI[sha256sum] = "c4cd89e1d350d2472f32de5f6266ac9f3658a3620eace3f79efac45db4323b65"
