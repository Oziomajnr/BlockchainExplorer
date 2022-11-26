<html>
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Open+Sans:ital,wght@0,300;0,400;0,600;0,700;0,800;1,300;1,400;1,600;1,700;1,800&display=swap" rel="stylesheet">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="/static/overrides.css" rel="stylesheet">
<title>BlockExplorer.com | Block 103890</title>
<link rel="apple-touch-icon" sizes="180x180" href="/static/apple-touch-icon.png">
<link rel="icon" type="image/png" sizes="32x32" href="/static/favicon-32x32.png">
<link rel="icon" type="image/png" sizes="16x16" href="/static/favicon-16x16.png">
<link rel="manifest" href="/static/site.webmanifest">
<meta name="msapplication-TileColor" content="#da532c">
<meta name="theme-color" content="#ffffff">
</head>
<body class="bg-gray-100 cursor-default">
<nav class="py-2 px-4 main-nav grid grid-cols-2 md:grid-cols-3 gap-4 bg-white filter drop-shadow-lg items-center relative z-20">
<a class="hidden md:block main-nav__logo" href="/">
<img src="/static/images/logo.svg" />
</a>
<div class="md:text-center">
<a href="/">
<img src="/static/images/handshake.svg" class="md:ml-auto mr-auto" />
</a>
</div>
<div class="flex space-x-4 content-center justify-end">
<a href="/" class="hidden md:block text-gray-500 hover:text-gray-700 px-3 py-2 font-medium text-sm rounded-md">
Home
</a>
<a href="/blockchain" class="text-gray-500 hover:text-gray-700 px-3 py-2 font-medium text-sm rounded-md">
Blockchain
</a>
<a href="/domains" class="text-gray-500 hover:text-gray-700 px-3 py-2 font-medium text-sm rounded-md">
Domains
</a>
<div class="text-gray-500 hover:text-gray-700 px-3 py-2 font-medium text-sm rounded-md cursor-pointer" id="nav-more-btn-root">
More
</a>
</div>
</nav>
<section class="relative">
<div class="hero-bg"></div>
<div class="absolute inset-0 pt-6 px-4">
<div class="max-w-5xl mx-auto pt-6">
<h1 class="text-white text-2xl font-bold mb-4">Block Detail</h1>
<div class="pt-4 mb-4">
<div class="bg-white rounded-md filter drop-shadow">
<div class="p-4">
<table>
<tr class="md:table-row-group md:flex-row flex flex-col border-b md:border-b-0">
<th class="md:pr-20 md:p-2 text-left font-normal text-sm">Block Hash: </th>
<td class="text-sm pb-2 md:p-0 break-all"> ${result.hash}</td>
</tr>
<tr class="md:table-row-group md:flex-row flex flex-col border-b md:border-b-0">
<th class="md:pr-20 md:p-2 pt-2 text-left font-normal text-sm">Height: </th>
<td class="text-sm font-semibold pb-2 md:p-0 break-all"> ${result.height}</td>
</tr>
<tr class="md:table-row-group md:flex-row flex flex-col border-b md:border-b-0">
<th class="md:pr-20 md:p-2 pt-2 text-left font-normal text-sm">Previous Block: </th>
<td class="text-sm pb-2 md:p-0 break-all">
<a href="/blocks/103889" class="text-purple-500"> ${result.previousblockhash}</a>
</td>
</tr>
<tr class="md:table-row-group md:flex-row flex flex-col">
<th class="md:pr-20 md:p-2 pt-2 text-left font-normal text-sm">Merkle Root: </th>
<td class="text-sm md:p-0 break-all"> ${result.merkleroot}</td>
</tr>
</table>
</div>
</div>
</div>
<#list result.tx as transaction>

<div class="pt-4 pb-4">
<div class="bg-white rounded-md filter drop-shadow">
<div class="px-4 py-2 border-b border-gray-200">
<h3 class="font-semibold truncate">
TX # <a href="/txs/${transaction.txid}" class="text-purple-500">${transaction.hash}</a>
</h3>
</div>
<div class="p-4">
<div class="md:flex flex-row gap-4">
<div class="w-100 md:w-50 flex-1">
<h4 class="uppercase mb-2 text-xs font-semibold text-gray-400">Inputs</h4>
<div class="space-y-4">
<div>
<div class="flex flex-row items-center mb-2">
<a href="/addrs/${transaction.hash}" class="text-purple-500 text-reg">
${transaction.hash}
</a>
<div class="bg-gray-100 text-gray-400 px-2 py-1 ml-auto text-xs rounded-sm">
12.784540 HNS
</div>
</div>
<div class="text-sm">
<span class="text-gray-400">Prevout:</span>
<a class="text-purple-500" href="/txs/4050b8212cb3192fd97ae96119b8592eec5ab4f01329f6e57509283751e546dc">4050b8212c...3751e546dc</a>
</div>
</div>
<div>
<div class="flex flex-row items-center mb-2">
<a href="/addrs/hs1qyww5n2e8d4qgxq79tka0cpxavtcgh5gw9stckr" class="text-purple-500 text-reg">
hs1qyww5n2...h5gw9stckr
</a>
<div class="bg-gray-100 text-gray-400 px-2 py-1 ml-auto text-xs rounded-sm">
2002.019610 HNS
</div>
</div>
<div class="text-sm">
<span class="text-gray-400">Prevout:</span>
<a class="text-purple-500" href="/txs/0bc5166dd210d676afc65ebad0cef1f11d595437c5aec924db5a1ee49502706f">0bc5166dd2...e49502706f</a>
</div>
</div>
</div>
</div>
<div class="hidden md:block flex-initial pt-6">
<img src="/static/images/caret-right.svg">
</div>
<div class="mt-4 md:mt-0 w-100 md:w-50 flex-1">
<h4 class="uppercase mb-2 text-xs font-semibold text-gray-400">Outputs</h4>
<div class="space-y-4">
<div class="flex flex-row items-center">
<a href="/addrs/hs1q9mkexfnsxstsnejm9eqf07f773ymsqgyp8gm8n" class="text-purple-500 text-reg">
hs1q9mkexf...sqgyp8gm8n
</a>
<div class="bg-gray-100 text-gray-400 px-2 py-1 ml-auto text-xs rounded-sm">
605.777621 HNS
</div>
</div>
<div class="flex flex-row items-center">
<a href="/addrs/hs1q8vnd9e4w0ehz856c3j9dxy9natmc02zavafetc" class="text-purple-500 text-reg">
hs1q8vnd9e...02zavafetc
</a>
<div class="bg-gray-100 text-gray-400 px-2 py-1 ml-auto text-xs rounded-sm">
1408.926529 HNS
</div>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
</#list>
<div class="pt-4 pb-4">
<div class="bg-white px-4 py-3 flex items-center justify-between sm:px-6 bg-white rounded-md filter drop-shadow">
<div class="flex-1 flex justify-between sm:hidden">
<a href="#" class="relative inline-flex items-center px-4 py-2 border border-gray-300 text-sm font-medium rounded-md text-gray-700 bg-white hover:text-gray-500">
Previous
</a>
<a href="#" class="ml-3 relative inline-flex items-center px-4 py-2 border border-gray-300 text-sm font-medium rounded-md text-gray-700 bg-white hover:text-gray-500">
Next
</a>
</div>
<div class="hidden sm:flex-1 sm:flex sm:items-center sm:justify-between">
<div>
<p class="text-sm text-gray-700">
Showing
<span class="font-medium">1</span>
to
<span class="font-medium">50</span>
of
<span class="font-medium">161</span>
</p>
</div>
<div>
<nav class="relative z-0 inline-flex rounded-md shadow-sm -space-x-px" aria-label="Pagination">
<a href="" class="opacity-50 cursor-not-allowed relative inline-flex items-center px-2 py-2 rounded-l-md border border-gray-300 bg-white text-sm font-medium text-gray-500 hover:bg-gray-50">

<svg class="h-5 w-5" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 20 20" fill="currentColor" aria-hidden="true">
<path fill-rule="evenodd" d="M12.707 5.293a1 1 0 010 1.414L9.414 10l3.293 3.293a1 1 0 01-1.414 1.414l-4-4a1 1 0 010-1.414l4-4a1 1 0 011.414 0z" clip-rule="evenodd" />
</svg>
<span>Previous</span>
</a>
<a href="?page=2" class=" relative inline-flex items-center px-2 py-2 rounded-r-md border border-gray-300 bg-white text-sm font-medium text-gray-500 hover:bg-gray-50">
<span>Next</span>

<svg class="h-5 w-5" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 20 20" fill="currentColor" aria-hidden="true">
<path fill-rule="evenodd" d="M7.293 14.707a1 1 0 010-1.414L10.586 10 7.293 6.707a1 1 0 011.414-1.414l4 4a1 1 0 010 1.414l-4 4a1 1 0 01-1.414 0z" clip-rule="evenodd" />
</svg>
</a>
</nav>
</div>
</div>
</div>
</div>
</div>
<footer class="mt-2 pb-4">
<div class="text-center text-gray-500">
<a href="https://github.com/kurumiimari/hsexplorer" target="_blank">GitHub</a>
</div>
</footer>
</div>
</section>

<script src="https://cdn.usefathom.com/script.js" data-site="UAZMWFZE" defer></script>

<div id="bundle-root-nav-more-btn"></div>
<script src="/static/bundles/nav-more-btn.64e25e86e18bae6276b6.bundle.js" type="text/javascript"></script>
</body>
</html>