DESCRIPTION = "The Battle for Wesnoth is a turn-based strategy game with a fantasy theme."
HOMEPAGE = "https://www.wesnoth.org/"
SECTION = "games"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://copyright;md5=794c9526b4086a97155c27908976bbfd"

DEPENDS = "asio freetype libsdl2-image libsdl2-mixer libsdl2-net libsdl2-ttf zlib boost pango libpng"

SHRT_VER = "${@oe.utils.trim_version("${PV}", 2)}"

SRC_URI = " \
    ${SOURCEFORGE_MIRROR}/project/${BPN}/${BPN}-${SHRT_VER}/${BP}/${BP}.tar.bz2 \
    file://0001-Find-sdl-CFLAGS-with-pkg-config-sdl-config-is-not-us.patch \
    file://0002-Do-not-do-the-ar-ranlib-configure-dance-it-won-t-wor.patch \
    file://0003-Do-not-adjust-compiler-flags.patch \
"

SRC_URI[sha256sum] = "85c5ece5eb55807b9f155d7189bad21a1bd40f055a378bfb6e4d63e22cc16e7c"

ARM_INSTRUCTION_SET = "arm"

inherit cmake pkgconfig gettext

EXTRA_OECMAKE = "\
	-DENABLE_LOW_MEM=ON \
	-DENABLE_FRIBIDI=OFF \
	\
	-DCMAKE_BUILD_TYPE=RelWithDebInfo \
	-DENABLE_STRICT_COMPILATION=OFF \
	"

PACKAGES = "${PN}-doc ${PN}-music ${PN}-sounds \
	${PN}-dw ${PN}-dm ${PN}-did ${PN}-ei ${PN}-httt ${PN}-l ${PN}-low \
	${PN}-nr ${PN}-sof ${PN}-sota ${PN}-sotbe ${PN}-thot ${PN}-trow \
	${PN}-tsg ${PN}-tb ${PN}-utbs ${PN}-wc \
	${PN}-data \
	${PN}-all-campaigns \
	${PN}-all \
	${PN} ${PN}-dbg \
	${PN}-server \
	"

DESCRIPTION:${PN}-all = "The Battle for ${PN} with all campaigns, music and sounds"
DESCRIPTION:${PN}-all-campaigns = "The Battle for ${PN} with all campaigns."
DESCRIPTION:${PN}-sounds = "Optional sound package for The Battle for ${PN}"
DESCRIPTION:${PN}-music = "Optional music package for The Battle for ${PN}"
DESCRIPTION:${PN}-data = "Mandatory data package for The Battle for ${PN}"
DESCRIPTION:${PN}-server = "Optional Battle for Wesnoth server"

ALLOW_EMPTY:${PN}-all-campaigns = "1"
ALLOW_EMPTY:${PN}-all = "1"

do_configure:prepend() {
	rm -f ${S}/cmake/FindBoost.cmake
}

do_install:append() {
	#ugly hack but otherwise it would have required to
	#have MANDIR:STRING=share/man that would require a
	#second python function
	if [ -d ${D}${prefix}/man ];then
		mv ${D}${prefix}/man ${D}${mandir}
	fi

    rm -Rf ${D}/run
    rm -Rf ${D}/var
}

RDEPENDS:${PN} = "${PN}-data tremor"

RDEPENDS:${PN}-data = "bash python3"

RDEPENDS:${PN}-all-campaigns = "${PN} \
	${PN}-did ${PN}-dm ${PN}-dw ${PN}-ei ${PN}-httt \
	${PN}-l ${PN}-low ${PN}-nr ${PN}-sof ${PN}-sota ${PN}-sotbe \
	${PN}-tb ${PN}-thot ${PN}-trow ${PN}-tsg ${PN}-utbs ${PN}-wc"

# Installing wesnoth-all should pull everything in (like in Debian).
RDEPENDS:${PN}-all = "${PN} ${PN}-all-campaigns ${PN}-sounds ${PN}-music"

FILES:${PN}-music = "\
	${datadir}/wesnoth/data/core/music \
"

FILES:${PN}-sounds = "\
	${datadir}/wesnoth/data/core/sounds \
"

# Picks up remaining translations and data. Must be packaged after
# wesnoth-music, wesnoth-sounds and all campaigns.
FILES:${PN}-data = "\
	${datadir}/wesnoth/sounds \
	${datadir}/wesnoth/images \
	${datadir}/wesnoth/data \
	${datadir}/wesnoth/fonts \
	${datadir}/wesnoth/translations \
	${datadir}/wesnoth/l10n-track \
"

FILES:${PN} = "\
	${bindir}/wesnoth \
	${datadir}/icons \
    ${datadir}/metainfo \
	${datadir}/applications/org.wesnoth.Wesnoth.desktop \
	${datadir}/pixmaps/wesnoth-icon.png \
"

FILES:${PN}-server = "\
	${bindir}/wesnothd \
	${localstatedir}/run/wesnothd \
"

FILES:${PN}-did = "\
	${datadir}/wesnoth/data/campaigns/Descent_Into_Darkness \
	${datadir}/wesnoth/translations/*/LC_MESSAGES/wesnoth-did.mo \
"

FILES:${PN}-dm = "\
	${datadir}/wesnoth/data/campaigns/Delfadors_Memoirs \
	${datadir}/wesnoth/translations/*/LC_MESSAGES/wesnoth-dm.mo \
"

FILES:${PN}-dw = "\
	${datadir}/wesnoth/data/campaigns/Dead_Water \
	${datadir}/wesnoth/translations/*/LC_MESSAGES/wesnoth-dw.mo \
"

FILES:${PN}-ei = "\
	${datadir}/wesnoth/data/campaigns/Eastern_Invasion \
	${datadir}/wesnoth/translations/*/LC_MESSAGES/wesnoth-ei.mo \
"

FILES:${PN}-httt = "\
	${datadir}/wesnoth/data/campaigns/Heir_To_The_Throne \
	${datadir}/wesnoth/translations/*/LC_MESSAGES/wesnoth-httt.mo \
"

FILES:${PN}-l = "\
	${datadir}/wesnoth/data/campaigns/Liberty \
	${datadir}/wesnoth/translations/*/LC_MESSAGES/wesnoth-l.mo \
"

FILES:${PN}-low ="\
	${datadir}/wesnoth/data/campaigns/Legend_of_Wesmere \
	${datadir}/wesnoth/translations/*/LC_MESSAGES/wesnoth-low.mo \
"

FILES:${PN}-nr = "\
	${datadir}/wesnoth/data/campaigns/Northern_Rebirth \
	${datadir}/wesnoth/translations/*/LC_MESSAGES/wesnoth-nr.mo \
"

FILES:${PN}-sof = "\
	${datadir}/wesnoth/data/campaigns/Sceptre_of_Fire \
	${datadir}/wesnoth/translations/*/LC_MESSAGES/wesnoth-sof.mo \
"

FILES:${PN}-sota = "\
	${datadir}/wesnoth/data/campaigns/Secrets_of_the_Ancients \
	${datadir}/wesnoth/translations/*/LC_MESSAGES/wesnoth-sota.mo \
"

FILES:${PN}-sotbe = "\
	${datadir}/wesnoth/data/campaigns/Son_Of_The_Black_Eye \
	${datadir}/wesnoth/translations/*/LC_MESSAGES/wesnoth-sotbe.mo \
"

FILES:${PN}-tb = "\
	${datadir}/wesnoth/data/campaigns/Two_Brothers \
	${datadir}/wesnoth/translations/*/LC_MESSAGES/wesnoth-tb.mo \
"

FILES:${PN}-thot = "\
	${datadir}/wesnoth/data/campaigns/The_Hammer_of_Thursagan \
	${datadir}/wesnoth/translations/*/LC_MESSAGES/wesnoth-thot.mo \
"

FILES:${PN}-trow = "\
	${datadir}/wesnoth/data/campaigns/The_Rise_Of_Wesnoth \
	${datadir}/wesnoth/translations/*/LC_MESSAGES/wesnoth-trow.mo \
"

FILES:${PN}-tsg = "\
	${datadir}/wesnoth/data/campaigns/The_South_Guard \
	${datadir}/wesnoth/translations/*/LC_MESSAGES/wesnoth-tsg.mo \
"

FILES:${PN}-utbs = "\
	${datadir}/wesnoth/data/campaigns/Under_the_Burning_Suns \
	${datadir}/wesnoth/translations/*/LC_MESSAGES/wesnoth-utbs.mo \
"

FILES:${PN}-wc = "\
	${datadir}/wesnoth/data/campaigns/World_Conquest \
	${datadir}/wesnoth/translations/*/LC_MESSAGES/wesnoth-wc.mo \
"
