DESCRIPTION = "Virtual Machine for several classic graphical point-and-click adventure games"
HOMEPAGE = "http://www.scummvm.org"
SECTION = "games"
PRIORITY = "optional"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=761a03e159b8bb74f377e30458e210e1"

inherit autotools-brokensep

SRC_URI = " \
    ${SOURCEFORGE_MIRROR}/scummvm/scummvm-${PV}.tar.bz2 \
    file://0001-use-pkg-config-to-gather-sdl-information.patch \
    file://scummvm.desktop \
    file://no-strip.patch \
"

DEPENDS = "virtual/libsdl libvorbis libogg zlib flac faad2 \
           ${@base_conditional('ENTERPRISE_DISTRO', '1', '', 'libmad mpeg2dec', d)}"

EXTRA_OECONF = " \
  --host=${HOST_SYS} \
  --backend=sdl \
  --with-sdl-prefix=${STAGING_BINDIR_CROSS} \
  --prefix=${prefix} \
  --with-ogg-prefix=${STAGING_LIBDIR}/.. \
  --with-vorbis-prefix=${STAGING_LIBDIR}/.. \
  --disable-alsa \
  --enable-plugins \
  --default-dynamic \
  --enable-all-engines \
  --disable-fluidsynth \
  ${@base_conditional('ENTERPRISE_DISTRO', '1', '--disable-mad', '--with-mad-prefix=${STAGING_LIBDIR}/..', d)} \
"

EXTRA_OEMAKE = "MANDIR=${mandir}"

do_configure() {
	./configure ${EXTRA_OECONF}
        sed -i "s/AS := as/AS := ${AS}/" ${S}/config.mk
        sed -i "s/AR := ar cru/AR := ${AR} cru/" ${S}/config.mk
        sed -i "s/STRIP := strip/STRIP := ${STRIP}/" ${S}/config.mk
        sed -i "s/RANLIB := ranlib/RANLIB := ${RANLIB}/" ${S}/config.mk
}

SRC_URI[md5sum] = "d71d1df5c8262556fedbe885972fbf6e"
SRC_URI[sha256sum] = "81831cd878a8daad2976f65c92139a2102233082c7d2770579d7e425b19cea2e"
